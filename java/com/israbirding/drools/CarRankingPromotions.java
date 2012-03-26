package com.israbirding.drools;

import java.util.Calendar;
import java.util.Date;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

public class CarRankingPromotions {

	public static void main(final String[] args) {

		final KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource("CarRanking.drl",
				CarRankingPromotions.class), ResourceType.DRL);

		if (kbuilder.hasErrors()) {
			System.out.println(kbuilder.getErrors().toString());
			throw new RuntimeException("Unable to compile \"CarRanking.drl\".");
		}

		final KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		final StatefulKnowledgeSession ksession = kbase
				.newStatefulKnowledgeSession();

		setupData(ksession);

		ksession.fireAllRules();

		ksession.dispose();
		System.out.println("After Dispose");
	}

	public static void setupData(StatefulKnowledgeSession ksession) {
		// Set Data for Session - Ranks
		Rank rank1 = new Rank("L1", 10000, "C1", "L2");
		Rank rank2 = new Rank("L2", 11000, "C1", "L3");
		Rank rank3 = new Rank("L3", 14000, "C2", "");
		// Set Data for Session - Cars
		Car car1 = new Car("C1", 5000);
		Car car2 = new Car("C2", 6000);
		Car car3 = new Car("C3", 7000);
		// Set data for session - Employee
		Employee employee1 = new Employee("E1", "David", "L1", 10000, "C1",
				getDate(2010, 1, 1), null, null, null);
		Employee employee2 = new Employee("E2", "Ron", "L1", 8000, "C1",
				getDate(2009, 1, 1), null, null, null);
		Employee employee3 = new Employee("E3", "Bob", "L1", 8000, "C3",
				getDate(2009, 1, 1), null, null, null);
		Employee employee4 = new Employee("E4", "Mary", "L2", 10000, "C1",
				getDate(2008, 5, 5), null, null, null);

		// Set data for Triggers
		PromotionTrigger trg1 = new PromotionTrigger(dateOneYearBack(getDate(
				2010, 7, 1)), "E1");
		PromotionTrigger trg2 = new PromotionTrigger(dateOneYearBack(getDate(
				2010, 7, 1)), "E2");
		PromotionTrigger trg3 = new PromotionTrigger(dateOneYearBack(getDate(
				2010, 7, 1)), "E3");
		PromotionTrigger trg4 = new PromotionTrigger(dateOneYearBack(getDate(
				2010, 7, 1)), "E4");

		// Map data to Session Context
		ksession.insert(rank1);
		ksession.insert(rank2);
		ksession.insert(rank3);
		ksession.insert(car1);
		ksession.insert(car2);
		ksession.insert(car3);
		ksession.insert(employee1);
		ksession.insert(employee2);
		ksession.insert(employee3);
		ksession.insert(employee4);
		ksession.insert(trg1);
		ksession.insert(trg2);
		ksession.insert(trg3);
		ksession.insert(trg4);

	}

	// Util method to replace JODA
	public static Date getDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);
		return cal.getTime();
	}

	public static Date dateOneYearBack(Date date) {
		Calendar today = Calendar.getInstance();
		today.setTime(date);
		today.add(Calendar.YEAR, -1);
		return today.getTime();
	}
}
