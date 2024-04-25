package io.delta.expense_tracker.expense;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping(path = "/list-expenses")
    public List<ExpenseEntity> expenseList() {
        return expenseService.getExpensesList();
    }

    @PostMapping(path = "/add-expense")
    public ExpenseEntity addExpense(@RequestBody ExpenseEntity expense) {
        return expenseService.addExpenseEntity(expense);
    }

}
