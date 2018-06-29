;; Drop Every Nth Item - http://www.4clojure.com/problem/41
(fn drop-every-nth [s n]
  (let [cnt (count s)
        idxs (for [i (range 0 cnt)
                   :when (not= 0 (mod (inc i) n))]
               i)]
    (map #(nth s %) idxs)))