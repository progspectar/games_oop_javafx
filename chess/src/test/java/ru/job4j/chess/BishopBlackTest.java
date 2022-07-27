package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void whenPositionIsOk() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell expect = bishopBlack.position();
        assertThat(Cell.A1, is(expect));
    }

    @Test
    public void whenCopyIsOk() {
        Cell result = new BishopBlack(Cell.A1).copy(Cell.A2).position();
        Cell expect = Cell.A2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenWayIsOk() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G5);
        Cell[] expect = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(result, is(expect));
    }
}
