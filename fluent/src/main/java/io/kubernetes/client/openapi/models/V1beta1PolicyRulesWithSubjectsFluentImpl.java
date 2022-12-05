package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1beta1PolicyRulesWithSubjectsFluentImpl<A extends V1beta1PolicyRulesWithSubjectsFluent<A>> extends BaseFluent<A> implements V1beta1PolicyRulesWithSubjectsFluent<A>{
  public V1beta1PolicyRulesWithSubjectsFluentImpl() {
  }
  public V1beta1PolicyRulesWithSubjectsFluentImpl(V1beta1PolicyRulesWithSubjects instance) {
    this.withNonResourceRules(instance.getNonResourceRules());

    this.withResourceRules(instance.getResourceRules());

    this.withSubjects(instance.getSubjects());

  }
  private ArrayList<V1beta1NonResourcePolicyRuleBuilder> nonResourceRules;
  private ArrayList<V1beta1ResourcePolicyRuleBuilder> resourceRules;
  private ArrayList<V1beta1SubjectBuilder> subjects;
  public A addToNonResourceRules(Integer index,V1beta1NonResourcePolicyRule item) {
    if (this.nonResourceRules == null) {this.nonResourceRules = new ArrayList<V1beta1NonResourcePolicyRuleBuilder>();}
    V1beta1NonResourcePolicyRuleBuilder builder = new V1beta1NonResourcePolicyRuleBuilder(item);_visitables.get("nonResourceRules").add(index >= 0 ? index : _visitables.get("nonResourceRules").size(), builder);this.nonResourceRules.add(index >= 0 ? index : nonResourceRules.size(), builder); return (A)this;
  }
  public A setToNonResourceRules(Integer index,V1beta1NonResourcePolicyRule item) {
    if (this.nonResourceRules == null) {this.nonResourceRules = new ArrayList<V1beta1NonResourcePolicyRuleBuilder>();}
    V1beta1NonResourcePolicyRuleBuilder builder = new V1beta1NonResourcePolicyRuleBuilder(item);
    if (index < 0 || index >= _visitables.get("nonResourceRules").size()) { _visitables.get("nonResourceRules").add(builder); } else { _visitables.get("nonResourceRules").set(index, builder);}
    if (index < 0 || index >= nonResourceRules.size()) { nonResourceRules.add(builder); } else { nonResourceRules.set(index, builder);}
     return (A)this;
  }
  public A addToNonResourceRules(io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule... items) {
    if (this.nonResourceRules == null) {this.nonResourceRules = new ArrayList<V1beta1NonResourcePolicyRuleBuilder>();}
    for (V1beta1NonResourcePolicyRule item : items) {V1beta1NonResourcePolicyRuleBuilder builder = new V1beta1NonResourcePolicyRuleBuilder(item);_visitables.get("nonResourceRules").add(builder);this.nonResourceRules.add(builder);} return (A)this;
  }
  public A addAllToNonResourceRules(Collection<V1beta1NonResourcePolicyRule> items) {
    if (this.nonResourceRules == null) {this.nonResourceRules = new ArrayList<V1beta1NonResourcePolicyRuleBuilder>();}
    for (V1beta1NonResourcePolicyRule item : items) {V1beta1NonResourcePolicyRuleBuilder builder = new V1beta1NonResourcePolicyRuleBuilder(item);_visitables.get("nonResourceRules").add(builder);this.nonResourceRules.add(builder);} return (A)this;
  }
  public A removeFromNonResourceRules(io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule... items) {
    for (V1beta1NonResourcePolicyRule item : items) {V1beta1NonResourcePolicyRuleBuilder builder = new V1beta1NonResourcePolicyRuleBuilder(item);_visitables.get("nonResourceRules").remove(builder);if (this.nonResourceRules != null) {this.nonResourceRules.remove(builder);}} return (A)this;
  }
  public A removeAllFromNonResourceRules(Collection<V1beta1NonResourcePolicyRule> items) {
    for (V1beta1NonResourcePolicyRule item : items) {V1beta1NonResourcePolicyRuleBuilder builder = new V1beta1NonResourcePolicyRuleBuilder(item);_visitables.get("nonResourceRules").remove(builder);if (this.nonResourceRules != null) {this.nonResourceRules.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromNonResourceRules(Predicate<V1beta1NonResourcePolicyRuleBuilder> predicate) {
    if (nonResourceRules == null) return (A) this;
    final Iterator<V1beta1NonResourcePolicyRuleBuilder> each = nonResourceRules.iterator();
    final List visitables = _visitables.get("nonResourceRules");
    while (each.hasNext()) {
      V1beta1NonResourcePolicyRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildNonResourceRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta1NonResourcePolicyRule> getNonResourceRules() {
    return nonResourceRules != null ? build(nonResourceRules) : null;
  }
  public List<V1beta1NonResourcePolicyRule> buildNonResourceRules() {
    return nonResourceRules != null ? build(nonResourceRules) : null;
  }
  public V1beta1NonResourcePolicyRule buildNonResourceRule(Integer index) {
    return this.nonResourceRules.get(index).build();
  }
  public V1beta1NonResourcePolicyRule buildFirstNonResourceRule() {
    return this.nonResourceRules.get(0).build();
  }
  public V1beta1NonResourcePolicyRule buildLastNonResourceRule() {
    return this.nonResourceRules.get(nonResourceRules.size() - 1).build();
  }
  public V1beta1NonResourcePolicyRule buildMatchingNonResourceRule(Predicate<V1beta1NonResourcePolicyRuleBuilder> predicate) {
    for (V1beta1NonResourcePolicyRuleBuilder item: nonResourceRules) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingNonResourceRule(Predicate<V1beta1NonResourcePolicyRuleBuilder> predicate) {
    for (V1beta1NonResourcePolicyRuleBuilder item: nonResourceRules) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withNonResourceRules(List<V1beta1NonResourcePolicyRule> nonResourceRules) {
    if (this.nonResourceRules != null) { _visitables.get("nonResourceRules").removeAll(this.nonResourceRules);}
    if (nonResourceRules != null) {this.nonResourceRules = new ArrayList(); for (V1beta1NonResourcePolicyRule item : nonResourceRules){this.addToNonResourceRules(item);}} else { this.nonResourceRules = null;} return (A) this;
  }
  public A withNonResourceRules(io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule... nonResourceRules) {
    if (this.nonResourceRules != null) {this.nonResourceRules.clear();}
    if (nonResourceRules != null) {for (V1beta1NonResourcePolicyRule item :nonResourceRules){ this.addToNonResourceRules(item);}} return (A) this;
  }
  public Boolean hasNonResourceRules() {
    return nonResourceRules != null && !nonResourceRules.isEmpty();
  }
  public V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> addNewNonResourceRule() {
    return new V1beta1PolicyRulesWithSubjectsFluentImpl.NonResourceRulesNestedImpl();
  }
  public V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> addNewNonResourceRuleLike(V1beta1NonResourcePolicyRule item) {
    return new V1beta1PolicyRulesWithSubjectsFluentImpl.NonResourceRulesNestedImpl(-1, item);
  }
  public V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> setNewNonResourceRuleLike(Integer index,V1beta1NonResourcePolicyRule item) {
    return new V1beta1PolicyRulesWithSubjectsFluentImpl.NonResourceRulesNestedImpl(index, item);
  }
  public V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editNonResourceRule(Integer index) {
    if (nonResourceRules.size() <= index) throw new RuntimeException("Can't edit nonResourceRules. Index exceeds size.");
    return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
  }
  public V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editFirstNonResourceRule() {
    if (nonResourceRules.size() == 0) throw new RuntimeException("Can't edit first nonResourceRules. The list is empty.");
    return setNewNonResourceRuleLike(0, buildNonResourceRule(0));
  }
  public V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editLastNonResourceRule() {
    int index = nonResourceRules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last nonResourceRules. The list is empty.");
    return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
  }
  public V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editMatchingNonResourceRule(Predicate<V1beta1NonResourcePolicyRuleBuilder> predicate) {
    int index = -1;
    for (int i=0;i<nonResourceRules.size();i++) { 
    if (predicate.test(nonResourceRules.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching nonResourceRules. No match found.");
    return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
  }
  public A addToResourceRules(Integer index,V1beta1ResourcePolicyRule item) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1beta1ResourcePolicyRuleBuilder>();}
    V1beta1ResourcePolicyRuleBuilder builder = new V1beta1ResourcePolicyRuleBuilder(item);_visitables.get("resourceRules").add(index >= 0 ? index : _visitables.get("resourceRules").size(), builder);this.resourceRules.add(index >= 0 ? index : resourceRules.size(), builder); return (A)this;
  }
  public A setToResourceRules(Integer index,V1beta1ResourcePolicyRule item) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1beta1ResourcePolicyRuleBuilder>();}
    V1beta1ResourcePolicyRuleBuilder builder = new V1beta1ResourcePolicyRuleBuilder(item);
    if (index < 0 || index >= _visitables.get("resourceRules").size()) { _visitables.get("resourceRules").add(builder); } else { _visitables.get("resourceRules").set(index, builder);}
    if (index < 0 || index >= resourceRules.size()) { resourceRules.add(builder); } else { resourceRules.set(index, builder);}
     return (A)this;
  }
  public A addToResourceRules(io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule... items) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1beta1ResourcePolicyRuleBuilder>();}
    for (V1beta1ResourcePolicyRule item : items) {V1beta1ResourcePolicyRuleBuilder builder = new V1beta1ResourcePolicyRuleBuilder(item);_visitables.get("resourceRules").add(builder);this.resourceRules.add(builder);} return (A)this;
  }
  public A addAllToResourceRules(Collection<V1beta1ResourcePolicyRule> items) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1beta1ResourcePolicyRuleBuilder>();}
    for (V1beta1ResourcePolicyRule item : items) {V1beta1ResourcePolicyRuleBuilder builder = new V1beta1ResourcePolicyRuleBuilder(item);_visitables.get("resourceRules").add(builder);this.resourceRules.add(builder);} return (A)this;
  }
  public A removeFromResourceRules(io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule... items) {
    for (V1beta1ResourcePolicyRule item : items) {V1beta1ResourcePolicyRuleBuilder builder = new V1beta1ResourcePolicyRuleBuilder(item);_visitables.get("resourceRules").remove(builder);if (this.resourceRules != null) {this.resourceRules.remove(builder);}} return (A)this;
  }
  public A removeAllFromResourceRules(Collection<V1beta1ResourcePolicyRule> items) {
    for (V1beta1ResourcePolicyRule item : items) {V1beta1ResourcePolicyRuleBuilder builder = new V1beta1ResourcePolicyRuleBuilder(item);_visitables.get("resourceRules").remove(builder);if (this.resourceRules != null) {this.resourceRules.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromResourceRules(Predicate<V1beta1ResourcePolicyRuleBuilder> predicate) {
    if (resourceRules == null) return (A) this;
    final Iterator<V1beta1ResourcePolicyRuleBuilder> each = resourceRules.iterator();
    final List visitables = _visitables.get("resourceRules");
    while (each.hasNext()) {
      V1beta1ResourcePolicyRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildResourceRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta1ResourcePolicyRule> getResourceRules() {
    return resourceRules != null ? build(resourceRules) : null;
  }
  public List<V1beta1ResourcePolicyRule> buildResourceRules() {
    return resourceRules != null ? build(resourceRules) : null;
  }
  public V1beta1ResourcePolicyRule buildResourceRule(Integer index) {
    return this.resourceRules.get(index).build();
  }
  public V1beta1ResourcePolicyRule buildFirstResourceRule() {
    return this.resourceRules.get(0).build();
  }
  public V1beta1ResourcePolicyRule buildLastResourceRule() {
    return this.resourceRules.get(resourceRules.size() - 1).build();
  }
  public V1beta1ResourcePolicyRule buildMatchingResourceRule(Predicate<V1beta1ResourcePolicyRuleBuilder> predicate) {
    for (V1beta1ResourcePolicyRuleBuilder item: resourceRules) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingResourceRule(Predicate<V1beta1ResourcePolicyRuleBuilder> predicate) {
    for (V1beta1ResourcePolicyRuleBuilder item: resourceRules) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withResourceRules(List<V1beta1ResourcePolicyRule> resourceRules) {
    if (this.resourceRules != null) { _visitables.get("resourceRules").removeAll(this.resourceRules);}
    if (resourceRules != null) {this.resourceRules = new ArrayList(); for (V1beta1ResourcePolicyRule item : resourceRules){this.addToResourceRules(item);}} else { this.resourceRules = null;} return (A) this;
  }
  public A withResourceRules(io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule... resourceRules) {
    if (this.resourceRules != null) {this.resourceRules.clear();}
    if (resourceRules != null) {for (V1beta1ResourcePolicyRule item :resourceRules){ this.addToResourceRules(item);}} return (A) this;
  }
  public Boolean hasResourceRules() {
    return resourceRules != null && !resourceRules.isEmpty();
  }
  public V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> addNewResourceRule() {
    return new V1beta1PolicyRulesWithSubjectsFluentImpl.ResourceRulesNestedImpl();
  }
  public V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> addNewResourceRuleLike(V1beta1ResourcePolicyRule item) {
    return new V1beta1PolicyRulesWithSubjectsFluentImpl.ResourceRulesNestedImpl(-1, item);
  }
  public V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> setNewResourceRuleLike(Integer index,V1beta1ResourcePolicyRule item) {
    return new V1beta1PolicyRulesWithSubjectsFluentImpl.ResourceRulesNestedImpl(index, item);
  }
  public V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editResourceRule(Integer index) {
    if (resourceRules.size() <= index) throw new RuntimeException("Can't edit resourceRules. Index exceeds size.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }
  public V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editFirstResourceRule() {
    if (resourceRules.size() == 0) throw new RuntimeException("Can't edit first resourceRules. The list is empty.");
    return setNewResourceRuleLike(0, buildResourceRule(0));
  }
  public V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editLastResourceRule() {
    int index = resourceRules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last resourceRules. The list is empty.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }
  public V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editMatchingResourceRule(Predicate<V1beta1ResourcePolicyRuleBuilder> predicate) {
    int index = -1;
    for (int i=0;i<resourceRules.size();i++) { 
    if (predicate.test(resourceRules.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching resourceRules. No match found.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }
  public A addToSubjects(Integer index,V1beta1Subject item) {
    if (this.subjects == null) {this.subjects = new ArrayList<V1beta1SubjectBuilder>();}
    V1beta1SubjectBuilder builder = new V1beta1SubjectBuilder(item);_visitables.get("subjects").add(index >= 0 ? index : _visitables.get("subjects").size(), builder);this.subjects.add(index >= 0 ? index : subjects.size(), builder); return (A)this;
  }
  public A setToSubjects(Integer index,V1beta1Subject item) {
    if (this.subjects == null) {this.subjects = new ArrayList<V1beta1SubjectBuilder>();}
    V1beta1SubjectBuilder builder = new V1beta1SubjectBuilder(item);
    if (index < 0 || index >= _visitables.get("subjects").size()) { _visitables.get("subjects").add(builder); } else { _visitables.get("subjects").set(index, builder);}
    if (index < 0 || index >= subjects.size()) { subjects.add(builder); } else { subjects.set(index, builder);}
     return (A)this;
  }
  public A addToSubjects(io.kubernetes.client.openapi.models.V1beta1Subject... items) {
    if (this.subjects == null) {this.subjects = new ArrayList<V1beta1SubjectBuilder>();}
    for (V1beta1Subject item : items) {V1beta1SubjectBuilder builder = new V1beta1SubjectBuilder(item);_visitables.get("subjects").add(builder);this.subjects.add(builder);} return (A)this;
  }
  public A addAllToSubjects(Collection<V1beta1Subject> items) {
    if (this.subjects == null) {this.subjects = new ArrayList<V1beta1SubjectBuilder>();}
    for (V1beta1Subject item : items) {V1beta1SubjectBuilder builder = new V1beta1SubjectBuilder(item);_visitables.get("subjects").add(builder);this.subjects.add(builder);} return (A)this;
  }
  public A removeFromSubjects(io.kubernetes.client.openapi.models.V1beta1Subject... items) {
    for (V1beta1Subject item : items) {V1beta1SubjectBuilder builder = new V1beta1SubjectBuilder(item);_visitables.get("subjects").remove(builder);if (this.subjects != null) {this.subjects.remove(builder);}} return (A)this;
  }
  public A removeAllFromSubjects(Collection<V1beta1Subject> items) {
    for (V1beta1Subject item : items) {V1beta1SubjectBuilder builder = new V1beta1SubjectBuilder(item);_visitables.get("subjects").remove(builder);if (this.subjects != null) {this.subjects.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromSubjects(Predicate<V1beta1SubjectBuilder> predicate) {
    if (subjects == null) return (A) this;
    final Iterator<V1beta1SubjectBuilder> each = subjects.iterator();
    final List visitables = _visitables.get("subjects");
    while (each.hasNext()) {
      V1beta1SubjectBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildSubjects instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta1Subject> getSubjects() {
    return subjects != null ? build(subjects) : null;
  }
  public List<V1beta1Subject> buildSubjects() {
    return subjects != null ? build(subjects) : null;
  }
  public V1beta1Subject buildSubject(Integer index) {
    return this.subjects.get(index).build();
  }
  public V1beta1Subject buildFirstSubject() {
    return this.subjects.get(0).build();
  }
  public V1beta1Subject buildLastSubject() {
    return this.subjects.get(subjects.size() - 1).build();
  }
  public V1beta1Subject buildMatchingSubject(Predicate<V1beta1SubjectBuilder> predicate) {
    for (V1beta1SubjectBuilder item: subjects) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingSubject(Predicate<V1beta1SubjectBuilder> predicate) {
    for (V1beta1SubjectBuilder item: subjects) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withSubjects(List<V1beta1Subject> subjects) {
    if (this.subjects != null) { _visitables.get("subjects").removeAll(this.subjects);}
    if (subjects != null) {this.subjects = new ArrayList(); for (V1beta1Subject item : subjects){this.addToSubjects(item);}} else { this.subjects = null;} return (A) this;
  }
  public A withSubjects(io.kubernetes.client.openapi.models.V1beta1Subject... subjects) {
    if (this.subjects != null) {this.subjects.clear();}
    if (subjects != null) {for (V1beta1Subject item :subjects){ this.addToSubjects(item);}} return (A) this;
  }
  public Boolean hasSubjects() {
    return subjects != null && !subjects.isEmpty();
  }
  public V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A> addNewSubject() {
    return new V1beta1PolicyRulesWithSubjectsFluentImpl.SubjectsNestedImpl();
  }
  public V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A> addNewSubjectLike(V1beta1Subject item) {
    return new V1beta1PolicyRulesWithSubjectsFluentImpl.SubjectsNestedImpl(-1, item);
  }
  public V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A> setNewSubjectLike(Integer index,V1beta1Subject item) {
    return new V1beta1PolicyRulesWithSubjectsFluentImpl.SubjectsNestedImpl(index, item);
  }
  public V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editSubject(Integer index) {
    if (subjects.size() <= index) throw new RuntimeException("Can't edit subjects. Index exceeds size.");
    return setNewSubjectLike(index, buildSubject(index));
  }
  public V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editFirstSubject() {
    if (subjects.size() == 0) throw new RuntimeException("Can't edit first subjects. The list is empty.");
    return setNewSubjectLike(0, buildSubject(0));
  }
  public V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editLastSubject() {
    int index = subjects.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last subjects. The list is empty.");
    return setNewSubjectLike(index, buildSubject(index));
  }
  public V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editMatchingSubject(Predicate<V1beta1SubjectBuilder> predicate) {
    int index = -1;
    for (int i=0;i<subjects.size();i++) { 
    if (predicate.test(subjects.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching subjects. No match found.");
    return setNewSubjectLike(index, buildSubject(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1PolicyRulesWithSubjectsFluentImpl that = (V1beta1PolicyRulesWithSubjectsFluentImpl) o;
    if (nonResourceRules != null ? !nonResourceRules.equals(that.nonResourceRules) :that.nonResourceRules != null) return false;
    if (resourceRules != null ? !resourceRules.equals(that.resourceRules) :that.resourceRules != null) return false;
    if (subjects != null ? !subjects.equals(that.subjects) :that.subjects != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(nonResourceRules,  resourceRules,  subjects,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (nonResourceRules != null && !nonResourceRules.isEmpty()) { sb.append("nonResourceRules:"); sb.append(nonResourceRules + ","); }
    if (resourceRules != null && !resourceRules.isEmpty()) { sb.append("resourceRules:"); sb.append(resourceRules + ","); }
    if (subjects != null && !subjects.isEmpty()) { sb.append("subjects:"); sb.append(subjects); }
    sb.append("}");
    return sb.toString();
  }
  class NonResourceRulesNestedImpl<N> extends V1beta1NonResourcePolicyRuleFluentImpl<V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<N>> implements V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<N>,Nested<N>{
    NonResourceRulesNestedImpl(Integer index,V1beta1NonResourcePolicyRule item) {
      this.index = index;
      this.builder = new V1beta1NonResourcePolicyRuleBuilder(this, item);
    }
    NonResourceRulesNestedImpl() {
      this.index = -1;
      this.builder = new V1beta1NonResourcePolicyRuleBuilder(this);
    }
    V1beta1NonResourcePolicyRuleBuilder builder;
    Integer index;
    public N and() {
      return (N) V1beta1PolicyRulesWithSubjectsFluentImpl.this.setToNonResourceRules(index,builder.build());
    }
    public N endNonResourceRule() {
      return and();
    }
    
  }
  class ResourceRulesNestedImpl<N> extends V1beta1ResourcePolicyRuleFluentImpl<V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<N>> implements V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<N>,Nested<N>{
    ResourceRulesNestedImpl(Integer index,V1beta1ResourcePolicyRule item) {
      this.index = index;
      this.builder = new V1beta1ResourcePolicyRuleBuilder(this, item);
    }
    ResourceRulesNestedImpl() {
      this.index = -1;
      this.builder = new V1beta1ResourcePolicyRuleBuilder(this);
    }
    V1beta1ResourcePolicyRuleBuilder builder;
    Integer index;
    public N and() {
      return (N) V1beta1PolicyRulesWithSubjectsFluentImpl.this.setToResourceRules(index,builder.build());
    }
    public N endResourceRule() {
      return and();
    }
    
  }
  class SubjectsNestedImpl<N> extends V1beta1SubjectFluentImpl<V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<N>> implements V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<N>,Nested<N>{
    SubjectsNestedImpl(Integer index,V1beta1Subject item) {
      this.index = index;
      this.builder = new V1beta1SubjectBuilder(this, item);
    }
    SubjectsNestedImpl() {
      this.index = -1;
      this.builder = new V1beta1SubjectBuilder(this);
    }
    V1beta1SubjectBuilder builder;
    Integer index;
    public N and() {
      return (N) V1beta1PolicyRulesWithSubjectsFluentImpl.this.setToSubjects(index,builder.build());
    }
    public N endSubject() {
      return and();
    }
    
  }
  
}