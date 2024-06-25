package li.selman.jmoleculesbytebuddy;

import org.jmolecules.ddd.types.AggregateRoot;
import org.jmolecules.ddd.types.Identifier;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.util.UUID;

public class Bestellung
        extends AbstractAggregateRoot<Bestellung>
        implements AggregateRoot<Bestellung, Bestellung.BestellungId> {

    private BestellungId id;

    @Override
    public BestellungId getId() {
        return id;
    }

    public record BestellungId(UUID id) implements Identifier {
    }
}
