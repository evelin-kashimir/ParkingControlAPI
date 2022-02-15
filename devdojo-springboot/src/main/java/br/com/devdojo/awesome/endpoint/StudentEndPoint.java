package br.com.devdojo.awesome.endpoint;

import br.com.devdojo.awesome.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import static java.util.Arrays.asList;

//Ponto final onde é acessado a API - Classe Controller
@RestController
@RequestMapping("student")
public class StudentEndPoint {

    //SELECT
    @RequestMapping(method = RequestMethod.GET, path = "/list")  //setando o caminho para acessar o metodo
    public List<Student> listAll(){
        return asList(new Student("Naruto"), new Student("Boruto"));
    }
}
