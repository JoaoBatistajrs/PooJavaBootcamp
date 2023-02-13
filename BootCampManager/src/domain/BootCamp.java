package domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BootCamp {
  private String nome;
  private String descricao;
  private final LocalDate dataInicial = LocalDate.now();
  private final LocalDate dataFinal = dataInicial.plusDays(45);
  private Set<Desenvolvedor> desenvolvedorInscrito = new HashSet<>();
  private Set<Conteudo> contedudoInscrito = new LinkedHashSet();

  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
    result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
    result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
    result = prime * result + ((desenvolvedorInscrito == null) ? 0 : desenvolvedorInscrito.hashCode());
    result = prime * result + ((contedudoInscrito == null) ? 0 : contedudoInscrito.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BootCamp other = (BootCamp) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (descricao == null) {
      if (other.descricao != null)
        return false;
    } else if (!descricao.equals(other.descricao))
      return false;
    if (dataInicial == null) {
      if (other.dataInicial != null)
        return false;
    } else if (!dataInicial.equals(other.dataInicial))
      return false;
    if (dataFinal == null) {
      if (other.dataFinal != null)
        return false;
    } else if (!dataFinal.equals(other.dataFinal))
      return false;
    if (desenvolvedorInscrito == null) {
      if (other.desenvolvedorInscrito != null)
        return false;
    } else if (!desenvolvedorInscrito.equals(other.desenvolvedorInscrito))
      return false;
    if (contedudoInscrito == null) {
      if (other.contedudoInscrito != null)
        return false;
    } else if (!contedudoInscrito.equals(other.contedudoInscrito))
      return false;
    return true;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public LocalDate getDataInicial() {
    return dataInicial;
  }
  public LocalDate getDataFinal() {
    return dataFinal;
  }
  public Set<Desenvolvedor> getDesenvolvedorInscrito() {
    return desenvolvedorInscrito;
  }
  public void setDesenvolvedorInscrito(Set<Desenvolvedor> desenvolvedorInscrito) {
    this.desenvolvedorInscrito = desenvolvedorInscrito;
  }
  public Set<Conteudo> getContedudoInscrito() {
    return contedudoInscrito;
  }
  public void setContedudoInscrito(Set<Conteudo> contedudoInscrito) {
    this.contedudoInscrito = contedudoInscrito;
  }
  
}
