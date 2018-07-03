;; Read a binary number - http://www.4clojure.com/problem/122
(fn [s]
  (let [binaries (map (comp #(- % 48) int) (reverse (seq s)))]
    (apply + (map * binaries (iterate #(* 2 %) 1)))))