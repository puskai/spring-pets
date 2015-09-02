package hu.puskai.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author zolika
 */
@Data
@Entity
@NoArgsConstructor
public class Person {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;

	private String name;

}
