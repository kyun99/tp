package seedu.budget;

import seedu.entry.ExpenseCategory;

public class EntertainmentBudget extends Budget {
    public EntertainmentBudget(double limit) {
        this.category = ExpenseCategory.ENTERTAINMENT;
        this.name = ExpenseCategory.ENTERTAINMENT.toString();
        this.limit = limit;
    }
}