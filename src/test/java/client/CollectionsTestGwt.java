/*                        __    __  __  __    __  ___
 *                       \  \  /  /    \  \  /  /  __/
 *                        \  \/  /  /\  \  \/  /  /
 *                         \____/__/  \__\____/__/.ɪᴏ
 * ᶜᵒᵖʸʳᶦᵍʰᵗ ᵇʸ ᵛᵃᵛʳ ⁻ ˡᶦᶜᵉⁿˢᵉᵈ ᵘⁿᵈᵉʳ ᵗʰᵉ ᵃᵖᵃᶜʰᵉ ˡᶦᶜᵉⁿˢᵉ ᵛᵉʳˢᶦᵒⁿ ᵗʷᵒ ᵈᵒᵗ ᶻᵉʳᵒ
 */
package client;

import io.vavr.Function1;
import io.vavr.Tuple;
import io.vavr.Tuple1;
import io.vavr.collection.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollectionsTestGwt {
    @Test
    public void testTuple() {
        Tuple1<Integer> t = Tuple.of(1);
        assertEquals((int) t._1, 1);
        assertEquals((int) t._1(), 1);
    }

    private void applyCollection(Function1<char[], Traversable<Character>> factory) {
        Traversable<Character> traversable = factory.apply(new char[]{'a', 'b', 'c'});
        assertEquals(traversable.count(i -> i != 'b'), 2);
    }

    @Test
    public void testCompileArray() {
        applyCollection(chars -> Array.ofAll(Iterator.ofAll(chars)));
    }

    @Test
    public void testCompileBitSet() {
        applyCollection(chars -> BitSet.withCharacters().ofAll(Iterator.ofAll(chars)));
    }

    @Test
    public void testCompileCharSeq() {
        applyCollection(chars -> CharSeq.ofAll(Iterator.ofAll(chars)));
    }

    @Test
    public void testCompileHashSet() {
        applyCollection(chars -> HashSet.ofAll(Iterator.ofAll(chars)));
    }

    @Test
    public void testCompileLinkedHashSet() {
        applyCollection(chars -> LinkedHashSet.ofAll(Iterator.ofAll(chars)));
    }

    @Test
    public void testCompileList() {
        applyCollection(chars -> List.ofAll(Iterator.ofAll(chars)));
    }

    @Test
    public void testCompilePriorityQueue() {
        applyCollection(chars -> PriorityQueue.ofAll(Iterator.ofAll(chars)));
    }

    @Test
    public void testCompileQueue() {
        applyCollection(chars -> Queue.ofAll(Iterator.ofAll(chars)));
    }

    @Test
    public void testCompileTreeSet() {
        applyCollection(chars -> TreeSet.ofAll(Iterator.ofAll(chars)));
    }

    @SuppressWarnings("Convert2MethodRef")
    @Test
    public void testCompileVector() {
        applyCollection(chars -> Vector.ofAll(chars));
    }
}
