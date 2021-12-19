package org.wecancodeit.com.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.wecancodeit.com.project.controllers.ContinentController;
import org.wecancodeit.com.project.models.Continent;
import org.wecancodeit.com.project.repositories.ContinentRepository;

import java.util.Arrays;
import java.util.Collection;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class ContinentControllerTest {

    @InjectMocks
    private ContinentController underTest;
    @Mock
    private ContinentRepository continentRepo;
    @Mock
    private Model mockModel;
    @Mock
    private Continent Continent1;
    @Mock
    private Continent Continent2;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldReturnAllContinents(){
        Collection<Continent> allContinents = Arrays.asList(Continent1,Continent2);
        when(continentRepo.findAll()).thenReturn(allContinents);
        underTest.displayContinents(mockModel);
        verify(mockModel).addAttribute("continents", allContinents);
    }
}
