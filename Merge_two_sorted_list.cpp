#include <iostream>
#include <vector>
using namespace std;

struct ListNode {
    int val;
    ListNode* next;
    ListNode(int x) : val(x), next(nullptr) {}
};

ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
    ListNode* dummy = new ListNode(0); //make dummy node
    ListNode* temp = dummy;

    ListNode* t1 = list1;
    ListNode* t2 = list2;

    while (t1 != NULL && t2 != NULL) {
        if (t1->val < t2->val) {       //adding minimum value of list1 and list2 by just comparing
            temp->next = t1;
            temp = t1;
            t1 = t1->next;
        } else {
            temp->next = t2;
            temp = t2;
            t2 = t2->next;
        }
    }

    if (t1 != NULL) {       //adding remaining list in dummy either list1 is left or list2 is left
        temp->next = t1;
    } else {
        temp->next = t2;
    }

    return dummy->next;
}

void printList(ListNode* head) {
    while (head != NULL) {
        cout << head->val;
        if (head->next) cout << " -> ";
        head = head->next;
    }
    cout << endl;
}

ListNode* createList(const vector<int>& vals) {
    if (vals.empty()) return nullptr;
    ListNode* head = new ListNode(vals[0]);
    ListNode* current = head;
    for (int i = 1; i < vals.size(); i++) {
        current->next = new ListNode(vals[i]);
        current = current->next;
    }
    return head;
}

int main() {
    vector<int> vals1 = {1, 3, 5};
    vector<int> vals2 = {2, 4, 6};

    ListNode* list1 = createList(vals1);
    ListNode* list2 = createList(vals2);

    cout << "List 1: ";
    printList(list1);

    cout << "List 2: ";
    printList(list2);

    ListNode* merged = mergeTwoLists(list1, list2);

    cout << "Merged List: ";
    printList(merged);

    return 0;
}
