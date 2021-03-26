package pl.air.bookstore.model;

public abstract class BaseEntity {
	
	protected Long id;
	private static Long sequencer = 1L;

	// ********** Constructors **********
	protected BaseEntity() {
		this.id = sequencer++;
	}

}
