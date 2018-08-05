;; Equivalence Classes - http://www.4clojure.com/problem/98
(fn [f D]
  (let [equivalence-classes (atom {})]
    (doseq [d D]
      (let [v (f d)
            eqc (get @equivalence-classes v #{})]
        (swap! equivalence-classes assoc v (conj eqc d))))
    (set (vals @equivalence-classes))))
