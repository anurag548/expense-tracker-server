package io.delta.expense_tracker.income;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IncomeEntity {

    @Id
    @GeneratedValue
    private int id;

    private String amount;

    private String type;

    private String expenseDate;

}
