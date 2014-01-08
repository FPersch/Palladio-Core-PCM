package com.palladio_simulator.protocom.tech;

/**
 * Subclasses of ConceptMapping are mapping language classes to entity representing ones.
 * The represented entity is the generic type of this class.
 * 
 * TODO: Due to recent changes, this class might already be obsolete. Or should at least be renamed.
 * 
 * @author Thomas Zolynski
 */
@SuppressWarnings("all")
public abstract class ConceptMapping<E/*  extends NamedElement */> {
  /**
   * Instance of a PCM entity.
   */
  protected E pcmEntity;
  
  /**
   * Constructor. Injects the PCM entity providing data.
   */
  public ConceptMapping(final E pcmEntity) {
    this.pcmEntity = pcmEntity;
  }
}
