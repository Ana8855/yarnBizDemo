package in.fin.main.fin.yarnbiz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {
	private String buyerId; 
	private String firstName;
	private String lastName;
	private String GST; 
	private String PAN;
	private String TAN;
	private String bankName;
	private String accountNo;
	private String IFSC;
	private String beneficiaryMobile; 

}
