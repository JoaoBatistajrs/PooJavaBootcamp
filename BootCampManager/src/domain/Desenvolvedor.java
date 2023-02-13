package domain;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Desenvolvedor {
  private String nome;
  private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<Conteudo> getConteudosIncritos() {
    return conteudosIncritos;
  }

  public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
    this.conteudosIncritos = conteudosIncritos;
  }

  public Set<Conteudo> getConteudosConcluidos() {
    return conteudosConcluidos;
  }

  public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
    this.conteudosConcluidos = conteudosConcluidos;
  }

  public void inscreverBootCamp(BootCamp bootcamp){
    this.conteudosIncritos.addAll(bootcamp.getContedudoInscrito());
    bootcamp.getDesenvolvedorInscrito().add(this);
  }

  public void progredir () {
    Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
    if(conteudo.isPresent()){
      this.conteudosConcluidos.add(conteudo.get());
      this.conteudosIncritos.remove(conteudo.get());
    } else {
      System.err.println("Você não está matriculado em nenhum conteúdo.");  
    }
  }

  public double calcularTotalXp(){
    return this.conteudosConcluidos.stream()
                                    .mapToDouble(conteudo -> conteudo.calcularXp())
                                    .sum();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((conteudosIncritos == null) ? 0 : conteudosIncritos.hashCode());
    result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
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
    Desenvolvedor other = (Desenvolvedor) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (conteudosIncritos == null) {
      if (other.conteudosIncritos != null)
        return false;
    } else if (!conteudosIncritos.equals(other.conteudosIncritos))
      return false;
    if (conteudosConcluidos == null) {
      if (other.conteudosConcluidos != null)
        return false;
    } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
      return false;
    return true;
  }
}
