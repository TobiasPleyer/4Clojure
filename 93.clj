;; Partially Flatten a Sequence - http://www.4clojure.com/problem/93
(fn [x]
  (let [last-seq? (fn [s]
                     (if (sequential? s)
                       ((complement sequential?) (first (seq s)))
                       false))]
    (filter last-seq?
      (rest (tree-seq sequential? seq x)))))
