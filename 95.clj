;; To Tree, or not to Tree - http://www.4clojure.com/problem/95
(fn [s]
  (let [nodes (tree-seq sequential?
                        (fn [cs]
                          (if (sequential? cs)
                            (filter #(not= nil %) (rest cs))
                            '())) s)]
    (and (every? sequential? nodes) (every? #(= 3 (count %)) nodes))))