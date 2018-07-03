;; dot product - http://www.4clojure.com/problem/143
(fn [v1 v2]
  (let [cnt (count v1)]
    (apply + (map #(* (nth v1 %) (nth v2 %)) (range cnt)))))