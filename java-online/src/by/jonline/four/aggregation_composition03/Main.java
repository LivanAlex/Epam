package by.jonline.four.aggregation_composition03;

import by.jonline.four.aggregation_composition03.area.Country;
import by.jonline.four.aggregation_composition03.area.District;
import by.jonline.four.aggregation_composition03.area.Region;
import by.jonline.four.aggregation_composition03.town.Town;
import by.jonline.four.aggregation_composition03.town.Type;

public class Main {

	public static void main(String[] args) {
		
		District uzdaDist = new District("Узденский район", new Town("Узда", Type.TOWN), 256);
		District vitebskDist = new District("Витебский район", new Town("Витебск", Type.CITY), 315);
		District minskDist = new District("Минский район", new Town("Минск", Type.CAPITAL), 415);
		
		Region vitebskReg = new Region("Витебская область");
		Region minskReg = new Region("Минская область");
		
		Country bel = new Country("Республика Беларусь");
		
		vitebskReg.addDistrict(vitebskDist);
		vitebskReg.addDistrict(uzdaDist);
		minskReg.addDistrict(minskDist);
		
		bel.addRegion(vitebskReg);
		bel.addRegion(minskReg);
		
		bel.showCapital();
		bel.showRegCount();
		bel.showRegionalCitys();
		bel.showArea();
	}
}
