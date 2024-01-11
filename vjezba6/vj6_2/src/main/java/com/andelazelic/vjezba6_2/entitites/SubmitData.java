package com.andelazelic.vjezba6_2.entitites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubmitData {
	private long clientId;
	private int value;
	private String month;
	private String year;

}
