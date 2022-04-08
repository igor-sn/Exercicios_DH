package br.com.meli.perolas.service;

import br.com.meli.perolas.dto.PearlDTO;
import br.com.meli.perolas.model.Pearl;
import br.com.meli.perolas.repository.PearlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PearlService {

    @Autowired
    private PearlRepository pearlRepository;

    public PearlDTO savePearl(PearlDTO pearlDTO){
        return new PearlDTO().convert(pearlRepository.save(PearlDTO.convert(pearlDTO)));

    }

    public List<PearlDTO> getAllPearls(){
        return pearlRepository.findAll()
                .stream()
                .map(pearl -> new PearlDTO (pearl.getId(), pearl.getMaterial(), pearl.getWight(), pearl.getCarats()))
                .collect(Collectors.toList());
    }

    public PearlDTO findById(Long id){
        return new PearlDTO().convert(pearlRepository.findById(id).orElseThrow(() -> new RuntimeException()));
    }

    public void removePearl(Long id){
        pearlRepository.delete(PearlDTO.convert(findById(id)));
    }

    public PearlDTO updatePearl(PearlDTO pearlDTO, Long id){
        return new PearlDTO().convert(pearlRepository.save(new Pearl(id, pearlDTO.getMaterial(), pearlDTO.getWight(), pearlDTO.getCarats())));
    }

}
