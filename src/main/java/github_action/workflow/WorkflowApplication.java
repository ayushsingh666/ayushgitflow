package github_action.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WorkflowApplication {

	@GetMapping("/mapping")
	public String welcome(){
		return "welcome to run build bro all good";
	}
	/*echo "# ayushgitflow" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:ayushsingh666/ayushgitflow.git
git push -u origin main*/
	public static void main(String[] args) {
		SpringApplication.run(WorkflowApplication.class, args);
	}

}
