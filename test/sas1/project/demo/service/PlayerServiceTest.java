package sas1.project.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import sas1.project.demo.model.Player;
import sas1.project.demo.repository.PlayerRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class PlayerServiceTest {

    static final int ID = 1234;
    static final Player p1 = new Player(234,"Molly1");
    static final Player p2 = new Player(235,"Molly2");
    static final Player p3 = new Player(236,"Molly3");

    @InjectMocks
    PlayerService playerService;

    @Mock
    PlayerRepository mockRepo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    void read() {
        Player player = new Player(ID,"Hans");
        Mockito.when(mockRepo.read(ID)).thenReturn(player);

        assertEquals(player,playerService.read(ID));
    }

    @Test
    void readAll() {
        List<Player> players = Arrays.asList(p1,p2,p3);
        Mockito.when(mockRepo.readAll()).thenReturn(players);

        assertEquals(players,playerService.readAll());
    }

    @Test
    void create() {
        Player p4 = new Player(4, "Ole");
        Mockito.when(mockRepo.create(p4)).thenReturn(true);
        assertTrue(playerService.create(p4));
    }

    @Test
    void update() {
        Mockito.when(mockRepo.update(p3)).thenReturn(true);
        assertTrue(playerService.update(p3));
    }

    @Test
    void delete() {
        Mockito.when(mockRepo.delete(p3.getPlayerId())).thenReturn(true);
        assertTrue(playerService.delete(p3.getPlayerId()));
    }
}