package io.delta.expense_tracker.income;

import io.delta.expense_tracker.expense.ExpenseEntity;
import io.delta.expense_tracker.expense.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeService {
    @Autowired
    private final IncomeRepository incomeRepository;

    public IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    public List<IncomeEntity> getExpensesList() {
        return incomeRepository.findAll();
    }

//    public ExpenseEntity getExpenseById(int id) {}

    public IncomeEntity addExpenseEntity(IncomeEntity expense) {
        return incomeRepository.save(expense);
    }

}
