package pointsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "emp_terceira", uniqueConstraints = @UniqueConstraint(columnNames = "empresa_ter_cnpj"))
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empresa_ter_id")
    private int BusinessId;

    @Column(name = "empresa_ter_nome")
    private String name;

    @Column(name = "empresa_ter_cnpj", unique = true)
    private String cnpj;

    @Column(name = "empresa_ter_contato")
    private String contact;

    public Business() {}

    public Business(int id, String name, String cnpj, String contact) {
        this.BusinessId = id;
        this.name = name;
        this.cnpj = cnpj;
        this.contact = contact;
    }

    public int getBusinessId() {
        return BusinessId;
    }

    public void setBusinessId(int id) {
        this.BusinessId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
