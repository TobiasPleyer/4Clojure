;; Pairwise Disjoint Sets - http://www.4clojure.com/problem/153
(fn [ss]
  (let [all-elems-count (reduce + 0 (map count ss))
        unique-elems-count (count (apply conj #{} (for [s ss e s] e)))]
    (= all-elems-count unique-elems-count)))    
