package Hospital_Starter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
	@Autowired
	private PatientRepository patientrepository;

	public  List<Patient> getallpatient(){
		List<Patient> patients = new ArrayList<>();
		patientrepository.findAll()
		.forEach(patients::add);
		return patients;
	}
	public void addPatient(Patient patient)
	{
		patientrepository.save(patient);
	}
	public void deletePatient(String regno)
	{
		patientrepository.deleteById(regno);
	}
	public void updatePatient(String regno,Patient patient) {
		patientrepository.save(patient);
	}
}
