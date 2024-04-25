package io.delta.expense_tracker.expense;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

 public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Integer> {
}
