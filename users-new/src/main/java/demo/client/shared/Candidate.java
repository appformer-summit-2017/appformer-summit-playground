package demo.client.shared;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Candidate implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "CANDIDATE_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "CANDIDATE_ID_SEQ", name = "CANDIDATE_ID_GENERATOR")
	private java.lang.Long id;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "Name")
	private demo.client.shared.Name name;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "Address")
	private demo.client.shared.Address address;

	@org.kie.api.definition.type.Label(value = "HR Notes")
	private java.lang.String notes;

	public Candidate() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public demo.client.shared.Name getName() {
		return this.name;
	}

	public void setName(demo.client.shared.Name name) {
		this.name = name;
	}

	public demo.client.shared.Address getAddress() {
		return this.address;
	}

	public void setAddress(demo.client.shared.Address address) {
		this.address = address;
	}

	public java.lang.String getNotes() {
		return this.notes;
	}

	public void setNotes(java.lang.String notes) {
		this.notes = notes;
	}

	public Candidate(java.lang.Long id, demo.client.shared.Name name,
			demo.client.shared.Address address, java.lang.String notes) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.notes = notes;
	}

}