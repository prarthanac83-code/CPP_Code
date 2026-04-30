#include<stdio.h>
#include<stdlib.h>
int main() {
int n = 9; // Number of requests
int req[] = {55, 58, 39, 18, 90, 160, 150, 38, 184};
int head = 50; // Starting position
int total_movement = 0;
printf("Order of service: ");
for (int i = 0; i < n; i++) {
printf("%d ", req[i]);
// Calculate absolute difference
int diff = abs(req[i] - head);
total_movement += diff;
// Update head to current request
head = req[i];
}
printf("\nTotal head movement: %d cylinders\n", total_movement);
return 0;
}
