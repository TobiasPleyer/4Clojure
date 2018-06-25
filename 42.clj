;; Factorial Fun - http://www.4clojure.com/problem/42
(fn fac [n]
  (let [result (atom 1)]
    (loop [i n]
      (if (= 0 i)
        @result
        (do
          (swap! result * i)
          (recur (dec i)))))))