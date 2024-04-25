package io.delta.expense_tracker.income;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IncomeController {
    private final IncomeService incomeService;

    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    @GetMapping(path = "/list-incomes")
    public List<IncomeEntity> expenseList() {
        return incomeService.getExpensesList();
    }

    @PostMapping(path = "/add-income")
    public IncomeEntity addExpense(@RequestBody IncomeEntity expense) {
        return incomeService.addExpenseEntity(expense);
    }
}
