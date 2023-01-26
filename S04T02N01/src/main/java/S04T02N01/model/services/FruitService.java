package S04T02N01.model.services;

import S04T02N01.model.domain.Fruit;

import java.util.List;

public interface FruitService {

	List<Fruit> findAllFruits();
	
	Fruit findFruitById(Long id);

	public String deleteFruit(Long id);

	public String updateFruit(Fruit fruit);

	Fruit saveFruit(Fruit fruitNew);

	
}
