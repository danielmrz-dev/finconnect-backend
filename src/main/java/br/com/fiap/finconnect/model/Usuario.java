package br.com.fiap.finconnect.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {

  @Id
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "SEQ_USUARIO"
  )
  @SequenceGenerator(
    name = "SEQ_USUARIO",
    sequenceName = "SEQ_USUARIO",
    allocationSize = 1
  )
  private Long id;

  @Column(length = 100, nullable = false)
  private String nome;

  @Column(length = 100, nullable = false)
  private String email;

  @Column(length = 255, nullable = false)
  private String senha;

  @Column(name = "NR_CPF", length = 20, nullable = false)
  private String cpf;

  @Column(name = "NR_TELEFONE", length = 20)
  private String telefone;

  @Column(name = "DATA_NASCIMENTO")
  private LocalDate dataNascimento;
  private Double renda;
  private String objetivos;


  public Usuario(Long id, String nome, String email, String senha, String cpf, String telefone, LocalDate dataNascimento, Double renda, String objetivos) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.cpf = cpf;
    this.telefone = telefone;
    this.dataNascimento = dataNascimento;
    this.renda = renda;
    this.objetivos = objetivos;
  }

  public Usuario(String nome, String email, String senha, String cpf, String telefone, LocalDate dataNascimento, Double renda, String objetivos) {
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.cpf = cpf;
    this.telefone = telefone;
    this.dataNascimento = dataNascimento;
    this.renda = renda;
    this.objetivos = objetivos;
  }

  public Usuario() {}
  public Long getId() { return id; }
  public String getNome() { return nome; }
  public void setNome(String nome) { this.nome = nome; }
  public String getEmail() { return email; }
  public void setEmail(String email) { this.email = email; }
  public String getSenha() { return senha; }
  public void setSenha(String senha) { this.senha = senha; }
  public String getCpf() { return cpf; }
  public void setCpf(String cpf) { this.cpf = cpf; }
  public String getTelefone() { return telefone; }
  public void setTelefone(String telefone) { this.telefone = telefone; }
  public LocalDate getDataNascimento() { return dataNascimento; }
  public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
  public Double getRenda() { return renda; }
  public void setRenda(Double renda) { this.renda = renda; }
  public String getObjetivos() { return objetivos; }
  public void setObjetivos(String objetivos) { this.objetivos = objetivos; }
}


