package br.furb.inf.template.utils;

import java.util.Date;

import br.furb.inf.template.enuns.FilterType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilterQueryImpl {

	private String field;
	private FilterType type;

	private String stringValue;
	private Long longValue;
	private Boolean boolValue;
	private Date dateValue;

}
