package in.naresh.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    
	 private String ticketName;
	 private String from;
	 private String to;
	 private String name;
	 
} 