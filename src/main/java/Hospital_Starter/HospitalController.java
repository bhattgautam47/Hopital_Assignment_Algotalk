package Hospital_Starter;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {
	
	@Autowired
	private PatientService patientservice;
	@RequestMapping("/patients")
	public List<Patient> getallpatient()
	{
		return Arrays.asList(
				
				
				);
	}

}
