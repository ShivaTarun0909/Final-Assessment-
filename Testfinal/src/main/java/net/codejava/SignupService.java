
package net.codejava;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class SignupService {
    @Autowired
    private SignupRepository repo;
    public List<Signup> listAll() {
        return repo.findAll();
    }

    public void save(Signup details) {
        repo.save(details);
    }

    public Signup get(char email) {
        char Signup;
        return repo.findById((long) email).get();
    }

    public void delete(char email) {
        repo.deleteById((long) email);
    }
}