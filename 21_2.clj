;; Nth Element - http://www.4clojure.com/problem/21
(fn [s n]
  (let [indices (range)
        index-map (zipmap indices s)]
    (get index-map n nil)))
