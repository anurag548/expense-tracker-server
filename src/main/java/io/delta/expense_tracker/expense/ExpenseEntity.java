package io.delta.expense_tracker.expense;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseEntity {

    @Id
    @GeneratedValue
    private int id;

    private String amount;

    private String description;

    private String type;

    private String expenseDate;
}
