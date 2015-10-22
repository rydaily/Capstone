package cs.campusquest.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    public static LinkedList<DummyQuest> dActiveQuestsList = new LinkedList<DummyQuest>();
    public static LinkedList<DummyQuest> dAvailableQuestsList = new LinkedList<DummyQuest>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "Item 1"));
        addItem(new DummyItem("2", "Item 2"));
        addItem(new DummyItem("3", "Item 3"));

        addAvailableQuest(new DummyQuest(0, "OLLI Presents \"Budgetary & Eco. Effects of Fed. Tax Policy\" NOV 4 at 3:30pm", "OLLI & Alumni Assoc. present \"Budgetary & Eco. Effects of Fed. Tax Policy\" on NOV 4th at 3:30pm at Garden & Arts Center at 44th St. & University Ave. Cost $20 for OLLIs. Must enroll online at www.olli.ttu.edu. Questions? Call 806-742-6554.", false, false));
        addAvailableQuest(new DummyQuest(1, "Museum: Come and See", "Free lecture by Museum of Texas Tech University's Curator of Clothing and Textiles, Dr. Marian Ann Montgomery, showcasing selections from the Museum's collection. Thursday, October 22 & Saturday, October 24, 2015", false, false));
        addAvailableQuest(new DummyQuest(2, "Join the Texas Tech Residence Halls Association for the annual “Safe Treat”", "On Wednesday, October 28 from 6pm to 8pm, TTU will be hosting the annual Halloween celebration, “Safe Treat.” The TTU Residence Halls Association (RHA) extends an invitation to the Lubbock community to trick-or-treat with us in a safe environment.", false, false));
        addAvailableQuest(new DummyQuest(3, "Surplus Warehouse Auction", "TTU will be having an auction on Saturday October 24th at 4611 Erskine Ave. Warehouse will open at 9:00 a.m. for viewing of items and auction will start at 10:00 a.m.", false, false));
        addAvailableQuest(new DummyQuest(4, "TECH STUDENT DEMOCRAT MEETING", "Please join us for our general meeting tomorrow, October 22nd at 6pm in the Llano room. ", false, false));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static void addActiveQuest(DummyQuest quest) {
        dActiveQuestsList.add(quest);
    }

    private static void addAvailableQuest(DummyQuest quest) {
        dAvailableQuestsList.add(quest);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }

    public static class DummyQuest {
        public int qId;
        public String qTitle;
        public String qDescription;
        public boolean qIsActive;
        public boolean qIsComplete;

        public DummyQuest(){
            this.qId = -1;
            this.qTitle = null;
            this.qDescription = null;
            this.qIsActive = false;
            this.qIsComplete = false;
        }

        public DummyQuest(int id, String title, String description, boolean isActive, boolean isComplete) {
            this.qId = id;
            this.qTitle = title;
            this.qDescription = description;
            this.qIsActive = isActive;
            this.qIsComplete = isComplete;
        }

    }
}
