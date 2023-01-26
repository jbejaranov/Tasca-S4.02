package S04T02N01.model.services;

import S04T02N01.model.domain.Fruit;
import S04T02N01.model.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FruitServiceImp {

	@Autowired
	private FruitRepository fruitRepository;

	public Fruit save(Fruit fruit) {
		return fruitRepository.save(fruit);
	}

	public List<Fruit> findAll() {
		return fruitRepository.findAll();
	}

	public Optional<Fruit> findById(Integer id){
		return fruitRepository.findById(id);
	}

	public void delete(Integer id) {
		fruitRepository.deleteById(id);
	}
	
	public String updateFruit(Fruit fruitUpdated) {
		Integer num = fruitUpdated.getId();
		if (fruitRepository.findById(num).isPresent()) {
			Fruit fruitToUpdate = new Fruit();
			fruitToUpdate.setId(fruitUpdated.getId());
			fruitToUpdate.setNom(fruitUpdated.getNom());
			fruitToUpdate.setQuantitatQuilos(fruitUpdated.getQuantitatQuilos());

			fruitRepository.save(fruitToUpdate);
			return "Fruita modificada";
		}
		return "Error al modificar la fruita";
	}
}
