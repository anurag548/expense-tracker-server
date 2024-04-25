package io.delta.expense_tracker.expense;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<ExpenseEntity> getExpensesList() {
        return expenseRepository.findAll();
    }

//    public ExpenseEntity getExpenseById(int id) {}

    public ExpenseEntity addExpenseEntity(ExpenseEntity expense) {
        return expenseRepository.save(expense);
    }
}
