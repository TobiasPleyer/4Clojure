;; Symmetric Difference - http://www.4clojure.com/problem/88
(fn tmp [s1 s2]
  (cond
    (empty? s1) s2
    (empty? s2) s1
    :else (let [only-s1 (apply disj s1 s2)
                only-s2 (apply disj s2 s1)]
            (apply conj only-s1 only-s2))))