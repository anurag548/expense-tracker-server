package io.delta.expense_tracker.income;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository  extends JpaRepository<IncomeEntity, Integer> {

}
