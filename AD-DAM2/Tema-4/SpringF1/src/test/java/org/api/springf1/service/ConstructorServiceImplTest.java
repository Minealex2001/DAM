package org.api.springf1.service;

import org.api.springf1.dto.ConstructorDTO;
import org.api.springf1.model.Constructor;
import org.api.springf1.repository.ConstructorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ConstructorServiceImplTest {

    @Mock
    private ConstructorRepository constructorRepository;

    @InjectMocks
    private ConstructorServiceImpl constructorService;

    Constructor constructor;

    ConstructorDTO constructorDTO;

    @BeforeEach
    void setup() {
        constructor = Constructor.builder().id(1L).ref("AAA").name("aaaa").nationality("oooo").build();
        constructorDTO = ConstructorDTO.builder().id(1L).ref("AAA").name("aaaa").build();
    }

    @Test
    void shouldReturnConstructorDTOWhenCreateConstructor() {
        when(constructorRepository.save(any(Constructor.class))).thenReturn(constructor);

        ConstructorDTO saveConstructor = constructorService.saveConstructor(constructor);

        assertNotNull(saveConstructor);
        assertEquals("AAA", saveConstructor.ref());

        verify(constructorRepository, times(1)).save(any(Constructor.class));
    }

    @Test
    void shouldReturnConstructorDTOWhenFindConstructorByCode() {
        when(constructorRepository.findByRefIgnoreCase("AAA")).thenReturn(java.util.Optional.of(constructor));

        ConstructorDTO constructorByCode = constructorService.getConstructorByRef("AAA");

        assertNotNull(constructorByCode);
        assertEquals("AAA", constructorByCode.ref());
    }
}