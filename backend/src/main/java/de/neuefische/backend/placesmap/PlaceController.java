package de.neuefische.backend.placesmap;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/places")
public class PlaceController {

    private final PlaceService placeService;

    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;

    }

    @GetMapping
    public List<Place> getAllBagPlaces(){
        return placeService.getAll();
    }

    @PostMapping
    public Place createBagPlaces(@RequestBody PlaceDTO placeDTO){
        return placeService.createBagPlace(placeDTO);
    }
}