package id.mandiri.day1.induction.be.service;

public class TotalAnimalService {

    private CatService catService;
    private FishService fishService;

    public TotalAnimalService(CatService catService, FishService fishService) {
        this.catService = catService;
        this.fishService = fishService;
    }

    public void getTotalAnimal() {
        String outputName = catService.getName() + " and " + fishService.getName();
        Integer outputTotalPrice = catService.getTotalPrice() + fishService.getTotalPrice();

        System.out.println(outputName);
        System.out.println(outputTotalPrice);
    }
}
